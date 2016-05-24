package com.cisco.webapp;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cisco.doa.UserDao;


@Path("/user")
public class UserService {
	
UserDao dao = new UserDao();
	
	public void setUserDao(UserDao dao){
		this.dao = dao;
	}
	@GET
	@Path("check/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Users getUser(@PathParam("param") String param) {
		System.out.println("check if : "+param+ " exists\n" );
		Users newUser = new Users();
		newUser.setEmailId("shhvemail");
		newUser.setName("shhv");
		newUser.setPassword("shhvpassword");
		return newUser;
	}
	
	
	@GET
	@Path("create/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Users getQuery(@PathParam("param") String param) {
		System.out.println("check if : "+param+ " exists\n" );
		Users newUser = new Users();
		newUser.setEmailId("shhvemail");
		newUser.setName("shhv");
		newUser.setPassword("shhvpassword");
		return newUser;
	}
	
	@GET
	@Path("blogs")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Users> getUser() {
		System.out.println("get blog contents" );
		List<Users> listUser = new ArrayList<Users>();
 		Users newUser = new Users();
		newUser.setEmailId("blogemail");
		newUser.setName("blog");
		newUser.setPassword("blogpassword");
		listUser.add(newUser);
		return listUser;
	}
	
	@GET
	@Path("titles")
	@Produces({MediaType.APPLICATION_JSON})
	public List<title> getTitles() {
		System.out.println("get titles" );
		List<title> listTitle = new ArrayList<title>();
		title newTitle = new title();
		newTitle.setTitle("This is the title");
		newTitle.setDescription("This layout is provided as a free CSS template and this is designed by Saw Htoo exclusively for templatemo.com website. Feel free to edit and apply this template layout for your personal or commercial websites. You may put a credit link back to templatemo.com at the footer. Thank you.Duis pulvinar scelerisque ante. Morbi tristique, risus quis congue pulvinar, nisl nisi commodo diam, a porta nisi ligula ac massa. Vestibulum blandit lacus sed sapien. Nunc quis sem nec tellus blandit tincidunt.");
		newTitle.setId(4);
		newTitle.setvalue(5);
		listTitle.add(newTitle);
		
		
		newTitle = new title();
		newTitle.setTitle("This is the title 2 ");
		newTitle.setDescription("This layout is provided as a free CSS template and this is designed by Saw Htoo exclusively for templatemo.com website. Feel free to edit and apply this template layout for your personal or commercial websites. You may put a credit link back to templatemo.com at the footer. Thank you.Duis pulvinar scelerisque ante. Morbi tristique, risus quis congue pulvinar, nisl nisi commodo diam, a porta nisi ligula ac massa. Vestibulum blandit lacus sed sapien. Nunc quis sem nec tellus blandit tincidunt.");
		newTitle.setId(5);
		newTitle.setvalue(4);
		listTitle.add(newTitle);
		
		
		
		newTitle = new title();
		newTitle.setTitle("This is the title 3 ");
		newTitle.setDescription("This layout is provided as a free CSS template and this is designed by Saw Htoo exclusively for templatemo.com website. Feel free to edit and apply this template layout for your personal or commercial websites. You may put a credit link back to templatemo.com at the footer. Thank you.Duis pulvinar scelerisque ante. Morbi tristique, risus quis congue pulvinar, nisl nisi commodo diam, a porta nisi ligula ac massa. Vestibulum blandit lacus sed sapien. Nunc quis sem nec tellus blandit tincidunt.");
		newTitle.setId(6);
		newTitle.setvalue(2);
		listTitle.add(newTitle);
		
		return listTitle;
	}
	
	@GET
	@Path("title/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public individualTitle getTitle(@PathParam("param") String param) {
		System.out.println("check if : "+param+ " exists\n" );
		System.out.println("get individual blog contents" );
		List<String> comments = new ArrayList<String>();
		individualTitle title = new individualTitle();
		title.setTitle("This is title");
		title.setDescription("This layout is provided as a free CSS template and this is designed by Saw Htoo exclusively for templatemo.com website. Feel free to edit and apply this template layout for your personal or commercial websites. You may put a credit link back to templatemo.com at the footer. Thank you.Duis pulvinar scelerisque ante. Morbi tristique, risus quis congue pulvinar, nisl nisi commodo diam, a porta nisi ligula ac massa. Vestibulum blandit lacus sed sapien. Nunc quis sem nec tellus blandit tincidunt.");
		title.setId(Integer.parseInt(param));
		comments.add("Comment 1");
		comments.add("Comment 2");
		comments.add("Comment 3");
		comments.add("Comment 4");
		title.setComments(comments);
		return title;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Users> getUsers() {
		return dao.getUsers();
	}
	
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void createUser(Users u){
		System.out.println("Creating user: "+u.getName());
	}
	
	@POST
	@Path("check")
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void checkUser(loginCheck data){
		System.out.println("check if : "+data.getpostEmail()+ " exists\n" );
	}
	
	@POST
	@Path("createQuery")
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void createQuery(Query query){
		System.out.println("create: "+query.getPostTitle()+"\t\t "+ query.getPostAbout() +" exists\n" );

	}
	
	
	@POST
	@Path("comment")
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void addComment(Comment comment){
		System.out.println("check if : "+comment.gettitle()+ " exists\n" );
		System.out.println("add : "+comment.getcomment()+ " exists\n" );
	} 
	
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	//public void updateUser(@FormParam("id") Integer id, @FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void updateUser(Users u){
		System.out.println("Updating user: "+u.getName());
		Session ses = HibernateUtil.currentSession();
		try {
			Transaction tx = ses.beginTransaction();
			ses.update(u);
			tx.commit();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	
	@DELETE
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public boolean deleteUser(@PathParam("param") Integer id) {
		System.out.println("Deleting user: "+id);
		Session ses = HibernateUtil.currentSession();
		try {
			Transaction tx = ses.beginTransaction();
			Users u = (Users) ses.load(Users.class, id);
			ses.delete(u);
			tx.commit();
			return true;
		} finally {
			HibernateUtil.closeSession();
		}
	}
	
}

