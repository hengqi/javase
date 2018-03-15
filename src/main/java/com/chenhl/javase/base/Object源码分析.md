#Object源码分析
 ##主要方法列表
    * getClass()
    * hashCode()
    * equals(Object obj)
    * clone()
    * toString()
    * notify()
    * notifyAll()
    * wait(long timeout)
    * wait(long timeout, int nanos)
    * wait()
    * finalize()
    
 ##方法详解

  ###public final native Class<?> getClass();
    > 这个方法是native的，并且是final的，即不能被重写。
    > 返回当前对象的运行时类型。被返回的Class对象是被表示类的静态同步方法锁定的。
    > 实际结果类型是Class<? extend |X|>,|X|是在getClass被调用的地方的静态类型的一种消除。
    
  ###public native int hashCode();  
    > 返回当前对象的hashCode值。
    
    
 