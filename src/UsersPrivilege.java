/**
*  类有:菜单，角色，和用户（操作员）
*  关系：用户和角色是多对多，角色和菜单是一对多;
*/

class Menu{
    private String menuId;
    private String menuName;
    private Role role;
    
    public Menu(String menuId, String menuName){
        this.menuId = menuId;
        this.menuName = menuName;
    }
    
    public Menu(){}
    
    public String getInfo(){
        return "<Menu Info> Menu ID:" + this.menuId + ", Menu's Name:" + this.menuName;
    }
    
    public Role getRole(){
        return this.role;
    }
    public void setRoles(Role role){
        this.role = role;
    }
    
    //其他getter,setter方法省略;
}

class Role{
    private long roleId;
    private String roleName;
    private Users[] users;
    private Menu[] menus;
    
    public Role(){}
    public Role(long roleId, String roleName){
        this.roleId = roleId;
        this.roleName = roleName;
    }
    
    public Users[] getUsers(){
        return this.users;
    }
    public void setUsers(Users[] users){
        this.users = users;
    }

    public Menu[] getMenus(){
        return this.menus;
    }
    public void setMenus(Menu[] menus){
        this.menus = menus;
    }
    
    public String getInfo(){
        return "<Role Info> Role ID:" + this.roleId + ", Role's Name:" + this.roleName;
    }  
    //其他getter,setter方法省略;    
}

class Users{
    private long userId;
    private String userName;
    private Role[] roles;
    
    public Users(){}
    public Users(long userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }
    
    public Role[] getRoles(){
        return this.roles;
    }
    public void setRoles(Role[] roles){
        this.roles = roles;
    }
    
    public String getInfo(){
        return "<Users Info> user id:" + this.userId + ", user's name:" + this.userName;
    }
    //其他getter,setter方法省略;    
}

public class UsersPrivilege{
    public static void main(String[] args){
        // 1.0 Set basic data
        Users user1 = new Users(1001,"Zhang San");
        Users user2 = new Users(1002,"Li SI");
        Users user3 = new Users(1003,"Wang Wu");
        Role role1 = new Role(89,"Administrator");
        Role role2 = new Role(88,"IT");
        Role role3 = new Role(99,"Settlement");
        Menu menuA = new Menu("SYS_INIT","System Initialize");
        Menu menuB = new Menu("FUND_INIT","Fund Initialize");
        Menu menuC = new Menu("STOCK_INIT","Stock Initialize");
        Menu menuD = new Menu("USERS_MANAGE","Users Manage");
        Menu menuE = new Menu("DEPOSIT_FUND","Fund Deposit");
        Menu menuF = new Menu("STOCK_DEPOSIT","Stock Deposit");
        // 1.1 Sett Roles with menus
        role1.setMenus(new Menu[] {menuD});
        role2.setMenus(new Menu[] {menuF,menuE});
        role3.setMenus(new Menu[] {menuA,menuB,menuC});
        // 1.2 Sett Menus with Roles
        menuA.setRoles(role3);
        menuB.setRoles(role3);
        menuC.setRoles(role3);
        menuD.setRoles(role1);
        menuE.setRoles(role2);
        menuF.setRoles(role2);
        // 1.2 Sett Users with Roles
        user1.setRoles(new Role[]{role1,role2,role3});
        user2.setRoles(new Role[]{role1,role2});
        user3.setRoles(new Role[]{role2,role3});
        role1.setUsers(new Users[]{user1,user2});
        role2.setUsers(new Users[]{user1,user2,user3});
        role3.setUsers(new Users[]{user1,user3});
        
        // 2.Get data's relationship
        System.out.println("--------Get all roles by user1,and all menus that role1 has---------");
        System.out.println(user1.getInfo());
        for(int i=0; i < user2.getRoles().length; i++){
            System.out.println("\t|-" + user2.getRoles()[i].getInfo());
            
            for(int j=0; j< user2.getRoles()[i].getMenus().length; j++){
                System.out.println("\t\t|-" + user2.getRoles()[i].getMenus()[j].getInfo());
            }
        }

        System.out.println("--------Get all menus by role2, and all users by role2---------");
        System.out.println(role2.getInfo());
        System.out.println("\t|-----Get all menus by role2------");
        for(int i=0; i < role2.getMenus().length; i++){
            System.out.println("\t\t|-" + role2.getMenus()[i].getInfo());
        } 
        System.out.println("\t|-----Get all users by role2------");
        for(int j=0; j< role2.getUsers().length; j++){
            System.out.println("\t\t|-" + role2.getUsers()[j].getInfo());
        }

        System.out.println("--------Get all users by menuB---------");
        System.out.println(menuB.getInfo());
        for (int i=0; i< menuB.getRole().getUsers().length; i ++){
            System.out.println("\t|-" + menuB.getRole().getUsers()[i].getInfo());
        }
    }
}