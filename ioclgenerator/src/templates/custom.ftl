<#if operation = "hasKey">
	<#assign operation = "containsKey">
</#if>
${sourceResult}.${operation}(<#list argResults as arg>${arg}<#if arg_has_next>, </#if></#list>)<#if isImperativeOperation?has_content>;</#if>