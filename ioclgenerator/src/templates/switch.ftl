<#compress>
<#list altPartResults as altPartResult>
<#if altPartResult_index == 0>
if ${altPartResult}
<#else>
else if ${altPartResult}
</#if>
</#list>
<#if elseResult?has_content>
else {
${elseResult}
}
</#if>
</#compress>