<#if argResult == 'Real'>
	<#assign argResult = 'Double'>
</#if>
(${sourceResult} instanceof ${argResult})