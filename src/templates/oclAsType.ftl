<#if argType == 'Integer'>
	<#if sourceType == 'Integer'>
${sourceResult}
	<#else>
new Integer(${sourceResult})
	</#if>
<#elseif argType == 'Real'>
	<#if sourceType == 'Real'>
${sourceResult}
	<#else>
new Double(${sourceResult})
	</#if>
<#elseif argType == 'String'>
	<#if sourceType == 'String'>
${sourceResult}
	<#else>
${sourceResult}.toString()
	</#if>
</#if>