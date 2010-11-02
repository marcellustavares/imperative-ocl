<#include "iteratorCommon.ftl">

for (java.util.Iterator<${tmpType}> it = ${sourceResult}.iterator(); it.hasNext();){
	${tmpName} = it.next(); 
	
	collection.add({bodyResult});	
} 

return collection;