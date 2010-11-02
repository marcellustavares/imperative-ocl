<#include "iteratorCommon.ftl">

for (java.util.Iterator<${accType}> it = source.iterator(); it.hasNext();){
	${accName} = it.next(); 
	
	if (${bodyResult}){
		collection.add(${accName});	
	}
} 

return collection;