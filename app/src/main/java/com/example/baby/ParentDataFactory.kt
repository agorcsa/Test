package com.example.baby

object ParentDataFactory{
    private fun randomChildren() : List<ChildModel>{
        return ChildDataFactory.getChildren(5)
    }
    fun getParents(count : Int) : List<ParentModel>{
        val parents = mutableListOf<ParentModel>()
        repeat(count){
            val parent = ParentModel(randomChildren())
            parents.add(parent)
        }
        return parents
    }
}