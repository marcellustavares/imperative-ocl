<#compress>
<#if argResult == 'Real'>
(Double)${sourceResult}
<#elseif argResult == 'String'>
${sourceResult}.toString()
<#else>
(${argResult})${sourceResult}
</#if>
</#compress>