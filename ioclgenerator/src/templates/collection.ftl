<#if collectionType == "Bag">
	<#assign type = "org.orcas.commons.collections.bag.HashBag">
<#elseif collectionType == "OrderedSet">
	<#assign type = "org.orcas.commons.collections.set.LinkedHashSet">
<#elseif collectionType == "Sequence">
	<#assign type = "org.orcas.commons.collections.list.TreeList">
<#else>
	<#assign type = "org.orcas.commons.collections.bag.HashBag">
</#if> 
new ${type}(
	java.util.Arrays.asList(<#list partResults as part>${part}<#if part_has_next>, </#if></#list>))