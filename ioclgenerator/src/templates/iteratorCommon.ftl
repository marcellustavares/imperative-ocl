java.util.Collection source = ${sourceResult};
java.util.Collection collection = new <#if sourceType?starts_with("Set")>org.orcas.commons.collections.set.HashSet<#elseif sourceType?starts_with("OrderedSet")>org.orcas.commons.collections.bag.HashBag<#elseif sourceType?starts_with("Set")>org.orcas.commons.collections.set.LinkedHashSet<#else>org.orcas.commons.collections.list.TreeList</#if>();
<#list variableResults as variable>
${variable}
</#list> 