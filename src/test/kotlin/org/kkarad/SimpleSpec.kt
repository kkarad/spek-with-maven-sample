package org.kkarad

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class SimpleSpec : Spek({
    describe("Spek") {
        it("runs") {
            kotlin.test.fail("Fail test deliberately to prove Spek works with maven")
            //kotlin.test.assertTrue { true }
        }
    }
})