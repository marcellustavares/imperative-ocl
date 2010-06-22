java.util.Collection collection = <#if sourceType == "Set">new org.orcas.commons.collections.set.HashSet<#elseif sourceType == "Sequence">org.orcas.commons.collections.list.TreeList<#elseif sourceType == "OrderedSet">org.orcas.commons.collections.set.LinkedHashSet<#else>org.orcas.commons.collections.bag.HashBag</#if>();
<#list variableResults as variable>
${variable}
</#list> 