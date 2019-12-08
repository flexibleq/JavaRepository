package com.fxq.classcode.day12.myarraylist;

/**
 * 自定义集合
 * 1.增
 * 2.删
 * 3.改
 * 4.查
 * 5.扩容
 * 6.获取集合的长度
 * 7.集合的内容转成一个字符串
 */
public class MyArrayList<E> {
    /**
     * 定义一个成员变量，表示数组实际的长度
     */
    private int size;
    /**
     * 表示数组的容量
     */
    private int capacity = 10;
    /**
     * 定义一个数组
     */
    Object[] elementArr;

    /**
     * 无参构造，初始化集合长度为10
     */
    public MyArrayList(){
        /**
         * 将成员数组初始化为10个长度
         */
        this.elementArr = new Object[10];
    }

    /**
     * 增加一个元素
     * @param e 增加的元素
     * @return 返回true
     */
    public boolean add(E e){
        if(size == capacity){
            int oldCapacity = elementArr.length;
            int newCapacity = oldCapacity + (oldCapacity>>1);
            Object[] newElement = new Object[newCapacity];
            System.arraycopy(elementArr,0,newElement,0,elementArr.length);
            elementArr = newElement;
            capacity = newCapacity;
        }
        this.elementArr[size] = e;
        size++;
        return true;
    }

    /**
     * 删除元素
     * @param index 要删除元素的索引
     * @return 返回被删除的元素
     */
    public E remove(int index){
        checkIndex(index);
        Object oldElement = this.elementArr[index];
        int movedNumber = size - index - 1;
        if(movedNumber > 0){
            System.arraycopy(elementArr,index+1,elementArr,index,movedNumber);
        }
        elementArr[--size] = null;
        return (E) oldElement;
    }

    /**
     * 修改指定索引处的元素
     * @param index 要修改元素的索引
     * @param e 用来修改的元素
     * @return 返回被修改的元素
     */
    public E set(int index,E e){
        checkIndex(index);
        Object oldElement = this.elementArr[index];
        this.elementArr[index] = e;
        return (E) oldElement;
    }

    /**
     * 获取指定索引处的元素
     * @param index 索引
     * @return 指定索引处的元素
     */
    public E get(int index){
        checkIndex(index);
        Object element = this.elementArr[index];
        return (E) element;
    }

    /**
     * 返回集合的长度
     * @return 集合的长度
     */
    public int size(){
        return size;
    }

    public String toString(){
        if(size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if(i == size - 1){
                sb.append(elementArr[i]).append("]");
            }else{
                sb.append(elementArr[i]).append(", ");
            }
        }
        return sb.toString();

    }
    /**
     * 检查索引是否越界
     * @param index
     */
    public void checkIndex(int index){
        if(index <0 || index >size-1){
            throw new ArrayIndexOutOfBoundsException("索引越界异常");
        }
    }
}
