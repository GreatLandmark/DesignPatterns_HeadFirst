package glm.design_patterns.head_first.ch11_proxy_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
    public String sayHello()throws RemoteException;
}