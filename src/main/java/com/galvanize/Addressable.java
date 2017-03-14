package com.galvanize;

import java.util.List;

/**
 * Created by svcmer2-2codev on 3/13/17.
 */
public interface Addressable
{
    public List<Address> getAddresses();

    public void addAddress(Address address);

}
