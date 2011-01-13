<#list variableResults as variable>
${variable?replace(";", " = null;")}
</#list> 

for (java.util.Iterator<${variableType}> it = ${sourceResult}.iterator(); it.hasNext();) {
	${variableName} = it.next(); 
	
	<#if conditionResult?has_content>
	if (${conditionResult}) {
		${bodyResult}
		<#if forName == "forOne">
		break;
		</#if>
	}
	<#else>
	${bodyResult}
	</#if>
}