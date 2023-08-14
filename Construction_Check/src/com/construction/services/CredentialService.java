package com.construction.services;

import java.util.*;

public class CredentialService {

class MyComparator implements Comparator<Object>

	{

		public int compare(Object obj1,Object obj2)

		{
			Integer i1=(Integer)obj1;

			Integer i2=(Integer)obj2;

			return i2.compareTo(i1);

		}
	}

}
