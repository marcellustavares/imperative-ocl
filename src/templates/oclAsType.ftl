<#compress>
<#if argResult == 'Integer'>
new Integer(${sourceResult})
<#elseif argResult == 'Real'>
new Double(${sourceResult})
<#elseif argResult == 'String'>
${sourceResult}.toString()
</#if>
</#compress>