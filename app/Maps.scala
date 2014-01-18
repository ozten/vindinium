package org.jousse.bot

object Maps {

  def get(name: String) = all get name

  lazy val all = Map(
    "m1" -> m1,
    "m2" -> m2,
    "m3" -> m3)

  val m1 = """
##@1    ####    @4##
      ########      
        ####        
    []        []    
$-    ##    ##    $-
$-    ##    ##    $-
    []        []    
        ####  @3    
      ########      
##@2    ####      ##"""

  val m2 = """
########################
########        ########
####$-            $-####
####  @1        @4  ####
##    []  $-$-  []    ##
##    ##  ####  ##    ##
##    ##  ####  ##    ##
##    []  $-$-  []    ##
####  @2        @3  ####
####$-            $-####
########        ########
########################"""

val m3 = """
                                        
                                        
                                        
          ##############
          ##  $-  $-  ##
          ##  $-  $-  ##
          ##  $-  $-  ##
          ##  $-  $-  ##
                                        
                                        
            
            []              []
##########  ##################
$-                    $-
##########  ####  ############
@1  @2                            @3  @4
            ################            
$-  $-                            $-  $-
"""

val m4 = """
####################################
################$-$-################
##########@1[]##    ##[]@4##########
##########  ##        ##  ##########
######$-    ####    ####    $-######
##########                ##########
########                    ########
######    ##  ########  ##    ######
######  $-##  ########  ##$-  ######
######  $-##  ########  ##$-  ######
######    ##  ########  ##    ######
########                    ########
##########                ##########
######$-    ####    ####    $-######
##########  ##        ##  ##########
##########@2[]##    ##[]@3##########
################$-$-################
####################################
"""
}
