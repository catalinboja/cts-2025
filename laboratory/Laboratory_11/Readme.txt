1. The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate; those messages will be dropped and not sent
- the chat server is managed by a different company and we don't have access to the source code

2. The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
- customer data backup
- receive updates for the forum
- update 3D models in silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the execution of the game. 
These routines can be executed in any order during the gameplay.

3. Players can pay their monthly subscription in different ways (paypal, bank card, crypto). The payment is done automatically each month based on the user preferences. Find a way to implement the payment action based on user settings without asking the player each month. Take into account that new payments methods could be introduced in the future.

4. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried


5. Game characters actions are affected by their state
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (lifepoints)