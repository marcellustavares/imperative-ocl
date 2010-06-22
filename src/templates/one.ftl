int count = 0;
<#list variableResults as variable>
${variable}
</#list> 

for (java.util.Iterator<${tmpType}> it = ${sourceResult}.iterator(); it.hasNext();){
	${tmpName} = it.next(); 
	
	if (${bodyResult}) count++;
} 

return count == 1;