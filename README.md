# Groovy String Comparison Pitfall: Type-Safe Equality

This example demonstrates a common pitfall in Groovy when comparing strings using the `==` operator. Groovy's `==` operator performs a type-safe equality check, meaning it checks both the value and the type of the objects being compared.

This can lead to unexpected results when comparing strings, especially if you're not careful about case sensitivity or the type of the strings involved. This repo contains the buggy code and a solution that uses the `.equals()` method for reliable string comparison in Groovy.
