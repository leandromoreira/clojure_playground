#Clojure
<a src="http://clojure.org/">Clojure</a>  is a dynamic programming language that targets the Java Virtual Machine (and the CLR, and JavaScript). It is designed to be a general-purpose language, combining the approachability and interactive development of a scripting language with an efficient and robust infrastructure for multithreaded programming. Clojure is a compiled language - it compiles directly to JVM bytecode, yet remains completely dynamic. Every feature supported by Clojure is supported at runtime. Clojure provides easy access to the Java frameworks, with optional type hints and type inference, to ensure that calls to Java can avoid reflection. 


##Namespace

```clojure
(in-ns 'my.namespace)
;this is how you enter or create a namespace
(clojure.core/use 'clojure.core)
;this is how you use (require and refer) the namespace
(import '(java.io InputStream File))
;this is only used for java import
```
##Importing and using contrib functions

```clojure
(use 'clojure.contrib.math)
(println (round 1.49999999999999999999))
(println (round 1.49999999999999999999M))
;restricting the use
(use '[clojure.contrib.math :only (round)])
```

##Better use of namespace

```clojure
(ns my.namespace
    (:use clojure.core clojure.contrib.str-utils)
    (:import (java.io File)))
```

##Working with Java

```clojure
; creating a java object on Clojure
(new java.util.Random)
; what about put this into a clojure Var.
(def rnd (new java.util.Random))
; using the special form . to acess methods on classes or object.
(println (. rnd nextInt))
(println (. rnd nextInt 10))
; Math it's already included because it's inside of java.lang
(println (. Math PI))
; importing the classes
(import '(java.util Random Locale)
        '(java.text MessageFormat))

; =======================
; Syntatic sugar for Java
; =======================

; you can instantiate a class using
(Random.)
; you can access a field using
(System/currentTimeMillis)
; you can chain calling
(.. person getAddress getZipCode)

```
#Resources

 * http://leandromoreira.com.br/2011/11/29/clojure-resources/
