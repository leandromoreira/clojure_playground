(in-ns 'myapp)
(clojure.core/use 'clojure.core)
(import '(java.io File))

(defn hello
  "A most used example ever for introduction on a new
  language. The hello world"
  [name]
  (println "Hello, " name))

(println "(- 10 5) = " 
         (- 10 5))
