//import com.yjy.entity.Product;
//import com.yjy.util.RedisSerializableUtil;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//public class testdemo {
//    @Test
//    public void a(){
//        Jedis jedis = new Jedis("192.168.211.128",6379);
//        //2、使用
//        jedis.set("sex","男");
//        System.out.println(jedis.get("sex"));
//        jedis.close();
//    }
//    @Test
//    public void b(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//                "spring-redis.xml");
//        JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
//        Jedis jedis = pool.getResource();
//        jedis.set("name", "lisi");
//        String name = jedis.get("name");
//        System.out.println(name);
//    }
//    @Test
//    public void c(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//                "spring-redis.xml");
//        JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
//        Jedis jedis = pool.getResource();
//        //序列化存
//        Product product = new Product();
//        product.setPid(1);
//        product.setDiscount("12345");
//        try {
//            jedis.set("001".getBytes(), RedisSerializableUtil.serialize(product));
//            //反序列化取
//            byte[] bytes = jedis.get("001".getBytes());
//            Product us = (Product)RedisSerializableUtil.unserizlize(bytes);
//            System.out.println(us);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
