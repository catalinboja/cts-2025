1. Game characters actions are affected by their state
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (lifepoints)


2. The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
- customer data backup
- receive updates for the forum
- update 3D models in silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the execution of the game. 
These routines can be executed in any order during the gameplay.