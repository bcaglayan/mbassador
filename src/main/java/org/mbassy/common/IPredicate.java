package org.mbassy.common;

/**
 * Created with IntelliJ IDEA.
 * User: benni
 * Date: 10/22/12
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IPredicate<T> {

    public boolean apply(T target);

}