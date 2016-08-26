(ns mlfirst.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [mlfirst.core-test]))

(doo-tests 'mlfirst.core-test)

