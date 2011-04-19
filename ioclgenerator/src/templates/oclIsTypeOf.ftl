<#if argResult == 'Real'>
	<#assign argResult = 'Double'>
</#if>
(${sourceResult}.getClass() == ${argResult}.class)