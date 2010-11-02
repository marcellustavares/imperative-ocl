boolean boolValue = true; 
<#list variableResults as variable>
${variable}
</#list> 

for (java.util.Iterator<${tmpType}> it = ${sourceResult}.iterator(); it.hasNext();){
	${tmpName} = it.next(); 
	
	if (!${bodyResult}) return false;
} 

return boolValue;