package com.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.UserDao;
import com.mybatis.entity.User;

public class T {
	private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader; 

    static{
        try{
        	reader = Resources.getResourceAsReader("configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

	public static void main(String[] args) {
		 SqlSession session = sqlSessionFactory.openSession();
	        try {
	            UserDao userDao=session.getMapper(UserDao.class);
	           // User user = new User();
	            //user.setId("22");
	            userDao.delete("22");
	           // user.setUsername("test2");
	            //userDao.update(user);
	            session.commit();
//	            List<User> userList = userDao.getAll();
//	            for (User user : userList) {
//	            	System.out.println(user.getUsername());
//		            System.out.println(user.getId());
//				}
//	            
	        } finally {
	            session.close();
	        }
	}
}
