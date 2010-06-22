<#assign type = argType>
<#if argType == 'Real'>
	<#assign type = 'Double'>
</#if>
${sourceResult}.getClass() == ${type}.class