package streampractice;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
*
    现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作：
        1:男演员只要名字为3个字的前三人
        2:女演员只要姓林的，并且不要第一个
        3:把过滤后的男演员姓名和女演员姓名合并到一起
        4:把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
            演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
* */
public class StreamDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        //添加元素
        manList.add("周润发");
        manList.add("古天乐");
        manList.add("吴京");
        manList.add("胡歌");
        manList.add("梁朝伟");
        manList.add("成龙");

        ArrayList<String> womenList = new ArrayList<String>();
        womenList.add("林青霞");
        womenList.add("刘亦菲");
        womenList.add("林心如");
        womenList.add("林志玲");
        womenList.add("王祖贤");
        womenList.add("柳岩");

        /*//男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        //女演员只要姓林的，并且不要第一个
        Stream<String> womenStream = womenList.stream().filter(s -> s.startsWith("林")).skip(1);
        //把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> stream = Stream.concat(manStream, womenStream);
        //把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        stream.map(Actor::new).forEach(s->System.out.println(s.getName()));*/
        //合并
        Stream.concat(manList.stream().filter(s->s.length() == 3).limit(3),
                womenList.stream().filter(s->s.startsWith("林")).skip(1)
                ).map(Actor::new).forEach(s->System.out.println(s.getName()));
    }
}
