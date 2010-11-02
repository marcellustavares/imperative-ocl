<#compress>
<#if sourceType?has_content && (sourceType == "Boolean" || sourceType == "Integer" || sourceType == "Real")>
!(${sourceResult} == ${argResult})
<#else>
!(${sourceResult}.equals(${argResult}))
</#if>
</#compress>