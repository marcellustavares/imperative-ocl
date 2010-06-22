java.util.Collection collection = new <#if sourceType?starts_with("Set")>org.orcas.commons.collections.set.HashSet<#elseif sourceType?starts_with("Sequence")>org.orcas.commons.collections.list.TreeList<#elseif sourceType?starts_with("OrderedSet")>org.orcas.commons.collections.set.LinkedHashSet<#else>org.orcas.commons.collections.bag.HashBag</#if>();
<#list variableResults as variable>
${variable}
</#list> 