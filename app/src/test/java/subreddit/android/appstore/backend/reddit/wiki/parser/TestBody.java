package subreddit.android.appstore.backend.reddit.wiki.parser;


public class TestBody {
    static final String HTMLBODY =
            "# Category1 Entry1\n" +
                    "\n" +
                    "## Category2 Entry1  \n" +
                    "\n" +
                    "###Category3 Entry1\n" +
                    "Name | Price | Device | Description | Contact\n" +
                    ":-----------|:------------|:------------|:------------|:------------|  \n" +
                    "[10000000](https://play.google.com/store/apps/details?id=com.eightyeightgames.tenmillion) | Paid | Phone+Tablet | 10000000 is a Dungeon Crawling RPG Matching Game. Run the dungeon and match to handle the things you encounter | luca@eightyeightgames.com\n" +
                    "[80 Days](https://play.google.com/store/apps/details?id=com.inkle.eightydays) | Paid | Phone+Tablet | 1872, with a steampunk twist. Phileas Fogg has wagered he can circumnavigate the world in just eighty days. | inkle@inklestudios.com\n" +
                    "[Alto's Adventure](https://play.google.com/store/apps/details?id=com.noodlecake.altosadventure) | Free | Phone+Tablet | Join Alto and his friends as they embark on an endless snowboarding odyssey. Journey across the beautiful alpine hills of their native wilderness, through neighbouring villages, ancient woodlands, and long-abandoned ruins. Along the way you'll rescue runaway llamas, grind rooftops, leap over terrifying chasms and outwit the mountain elders – all while braving the ever changing elements and passage of time upon the mountain. | support+android@noodlecake.com\n" +
                    "[BADLAND](https://play.google.com/store/apps/details?id=com.frogmind.badland) | Free | Phone+Tablet | BADLAND is an award-winning atmospheric side-scrolling action adventure platformer set in a gorgeous forest full of various inhabitants, trees and flowers. Although the forest appears to be right out of a beautiful fairy tale, there’s something terribly wrong. The player controls one of the forest dwellers to find out what’s going on, and discovers an astonishing number of imaginative traps and obstacles on the way. | support@frogmindgames.com  \n" +
                    "[Chameleon Run](https://play.google.com/store/apps/details?id=com.noodlecake.chameleonrun) | Paid | Phone+Tablet | Chameleon Run is a unique, fast and challenging autorunner with a colorful twist. Jump, switch and run through expertly crafted levels that will have you running back for more. Your goal is to switch your color to match the ground as you run and jump from platform to platform. Sounds easy right? Well think again! | support+android@noodlecake.com\n" +
                    "\n" +
                    "### Category3 Entry2\n" +
                    "Name | Price | Device | Description | Contact\n" +
                    ":-----------|:------------|:------------|:------------|:------------|  \n" +
                    "[Civilization Revolution 2](https://play.google.com/store/apps/details?id=com.t2kgames.civrev2) | Paid | Phone+Tablet | The sequel to one of the most successful strategy games on mobile is here! Sid Meier's Civilization Revolution 2 challenges players  to build a glorious empire that will stand the test of time. This is the first game in the Civilization catalog to be developed and available exclusively for mobile devices. Civilization Revolution 2 offers mobile strategy fans a brand new 3D presentation and more tactical depth than ever before! Find out if you have what it takes to rule the world! | civrev2support@2k.com\n" +
                    "[Clash Royale ](https://play.google.com/store/apps/details?id=com.supercell.clashroyale) | Free | Phone+Tablet | Enter the Arena! From the creators of Clash of Clans comes a real-time multiplayer game starring the Royales, your favorite Clash characters and much, much more. Collect and upgrade dozens of cards featuring the Clash of Clans troops, spells and defenses you know and love, as well as the Royales: Princes, Knights, Baby Dragons and more. Knock the enemy King and Princesses from their towers to defeat your opponents and win Trophies, Crowns and glory in the Arena. Form a Clan to share cards and build your very own battle community. | gp-info@supercell.com\n" +
                    "[Critical Ops](https://play.google.com/store/apps/details?id=com.criticalforceentertainment.criticalops) | Free | Phone+Tablet | Critical Ops is a fast-paced FPS that will test your reflexes and tactical skill. Experience the thrill of modern terrorist warfare as you fight a critical strike operation as a counter-terrorist or aim to cause destruction as a terrorist. | support@criticalforce.fi  \n" +
                    "[Fallout Shelter](https://play.google.com/store/apps/details?id=com.bethsoft.falloutshelter) | Free | Phone+Tablet | Create a brighter future…underground! Select from a variety of modern-day rooms to turn an excavation beneath 2,000 feet of bedrock into the very picture of Vault Life. | falloutshelterhelp@mail.bethesda.net  \n" +
                    "[Fate/Grand Order](https://play.google.com/store/apps/details?id=com.aniplex.fategrandorder) | Free | Phone+Tablet | Fate/Grand Order is an RPG for Android and iOS platforms which lets players take on the role of a fledgling master on a quest to save time and space. NOTE: THIS GAME IS IN JAPANESE. | cs_support@fate-go.jp\n" +
                    "[FRAMED](https://play.google.com/store/apps/details?id=com.noodlecake.framed) | Paid | Phone+Tablet | FRAMED is a multi-award winning noir-puzzle game where you re-arrange panels of animated comic book to change the outcome of the story. | support+android@noodlecake.com\n" +
                    "[Galaxy on Fire 2 HD](https://play.google.com/store/apps/details?id=net.fishlabs.gof2hdallandroid2012) | Free | Phone+Tablet | In the game, you take over the role of the hot-headed space war veteran Keith T. Maxwell and save the galaxy from its impeding destruction by the hands of devious alien raiders, ruthless space pirates and power-crazy madmen!  | info@dsfishlabs.com  \n" +
                    "[Granblue Fantasy](https://play.google.com/store/apps/details?id=jp.mbga.a12016007.lite) | Free | Phone+Tablet | Granblue Fantasy is a role-playing video game developed by Cygames for Android and iOS platforms, and released in Japan in March 2014. The game is notable for reuniting music composer Nobuo Uematsu and character designer Hideo Minaba, who also worked on Final Fantasy VI (1994), Final Fantasy IX (2000), and Lost Odyssey (2007). | open-07480@mbga.jp\n" +
                    "\n" +
                    "\n" +
                    "# Category1 Entry2\n" +
                    "\n" +
                    "## Category2 Entry1  \n" +
                    "\n" +
                    "### Category3 Entry1\n" +
                    "Name | Price | Device | Description | Contact\n" +
                    ":-----------|:------------|:------------|:------------|:------------|  \n" +
                    "[Hitman GO](https://play.google.com/store/apps/details?id=com.squareenixmontreal.hitmango) | Paid | Phone+Tablet | Hitman GO is a turn-based puzzle game with beautifully rendered diorama-style set pieces. You will strategically navigate fixed spaces on a grid to avoid enemies and take out your target or infiltrate well-guarded locations. You really have to think about each move and all the Hitman tools of the trade you would expect are included; disguises, distractions, sniper rifles and even 47’s iconic Silverballers. | eu-mobile-support@square-enix.com\n" +
                    "[Horizon Chase](https://play.google.com/store/apps/details?id=com.aquiris.horizonchase) | Free | Phone+Tablet | Horizon Chase is a love letter to all retro gaming fans. It's an addictive racing game inspired in the great hits of the 80's and 90's: Out Run, Lotus Turbo Challenge, Top Gear (SNES), Rush, among others. Each curve and each lap in Horizon Chase recreate classic arcade gameplay and offer you unbound speed limits of fun. Full throttle on and enjoy! | support@aquiris.com.br\n" +
                    "[Lara Croft GO](https://play.google.com/store/apps/details?id=com.squareenixmontreal.lcgo) | Paid | Phone+Tablet | Lara Croft GO is a turn based puzzle-adventure set in a long-forgotten world. Explore the ruins of an ancient civilization, discover well-kept secrets and face deadly challenges as you uncover the myth of the Queen of Venom. | eu-mobile-support@square-enix.com\n" +
                    "[Leo's Fortune](https://play.google.com/store/apps/details?id=com.leosfortune) | Paid | Phone+Tablet | Leo’s Fortune is an award-winning platform adventure game where you hunt down the cunning and mysterious thief that stole your gold. Beautifully hand-crafted levels bring the story of Leo to life in this epic adventure. | support@leosfortune.com\n" +
                    "[Lost Within](http://www.amazon.com/Amazon-Game-Studios-Lost-Within/dp/B00VGKMTKC/) | Paid | Phone+Tablet | From the developer of Prey -- Escape a haunted asylum by fighting or fleeing from its monstrous Inhabitants. Scavenge through ruins and create makeshift weapons to strike back at your enemies. Or--conserve your resources and employ stealth to sneak past the lurking horrors. When all else fails, run like mad and search for a place to hide! The building itself seems to be trying to tell you something. Strange visions of the past reveal buried secrets— terrors that are now coming alive all around you. To get out, you must solve a series of dark mysteries and discover the shattering secret that led to the asylum's condemnation. But the legendary serial killer who is rumored to inhabit the asylum is no myth … and he knows you are here. His howls of rage seem to shake the very walls. You must escape, but be careful. Though there are many doors, there is only one way out. | amazon-appstore-help@amazon.com  \n" +
                    "[LoveLive! School idol festival](https://play.google.com/store/apps/details?id=klb.android.lovelive_en) | Free | Phone+Tablet | A massive hit game app in Japan, now available worldwide! Featuring Aqours and μ's from the Love Live! series, as well as game-original characters. Support the school idols and help them make their dreams come true! | info-schoolfesta@klab.com\n" +
                    "[Monument Valley](https://play.google.com/store/apps/details?id=com.ustwo.monumentvalley) | Paid | Phone+Tablet | Monument Valley is a surreal exploration through fantastical architecture and impossible geometry. Guide the silent princess Ida through mysterious monuments, uncovering hidden paths, unfolding optical illusions and outsmarting the enigmatic Crow People. | support@monumentvalleygame.com\n" +
                    "[Odd Bot Out](https://play.google.com/store/apps/details?id=com.martinmagni.oddbotoutpaid) | Paid | Phone+Tablet | Odd is not like the other robots. After failing a standardized test Odd ends up in the recycling bin. Help Odd escape through the factory's 100 unique rooms. Each level in this contraption puzzle game presents a new challenge. Build a bridge across a (small) abyss. Design and drive an unsafe car. And ride a robotic centipede, like you always wanted to. | mail@martinmagni.com\n" +
                    "[Osmos HD](https://play.google.com/store/apps/details?id=com.hemispheregames.osmos) | Paid | Phone+Tablet | Enter the Darwinian world of a galactic mote. To survive, absorb smaller organisms and grow—but beware of larger predators! Winner of multiple \"Game of the Year\" awards, Osmos features unique physics-based play, stellar graphics, and a hypnotic soundtrack of ambient electronica. Ready to evolve? | androidsupport@hemispheregames.com\n" +
                    "[Out There: Ω Edition](https://play.google.com/store/apps/details?id=com.miclos.google.games.outthere) | Paid | Phone+Tablet | You are an astronaut awaking from cryonics not in the solar system, but... out there... in a far and unknown place of the galaxy. In Out There, you will have to survive, tinkering your ship with what you can gather drifting in the void, and spot garden planets to refill your oxygen supply. | support@miclos.com\n" +
                    "[Pixel Dungeon](https://play.google.com/store/apps/details?id=com.watabou.pixeldungeon) | Free | Phone+Tablet | Pixel Dungeon is a traditional roguelike* game with pixel-art graphics and simple interface. Explore the depths of Pixel Dungeon, collect useful items, fight fierce monsters to find Amulet of Yendor (surprise!) - the ultimate artifact of this game world. | pixeldungeon@watabou.ru\n" +
                    "[Pocket Mortys](https://play.google.com/store/apps/details?id=com.turner.pocketmorties) | Free | Phone+Tablet | Join Ricks throughout the multiverse as they get swept up in the latest craze: Morty training! There are over 70 bizarre Mortys to recruit and train out there, including Mustache Morty, Wizard Morty, Cronenberg Morty and more. Assemble a dream team, then challenge rival Ricks by forcing your grandsons to battle each other. Command, combine and level up your Mortys to prove that you're the greatest Morty trainer of all space and time!  | pocket.mortys.911@gmail.com\n" +
                    "[Shattered Pixel Dungeon](https://play.google.com/store/apps/details?id=com.shatteredpixel.shatteredpixeldungeon) | Free | Phone+Tablet | Shattered Pixel Dungeon is a Roguelike RPG, with pixel art graphics and lots of variety and replayability. Every game is unique, with four different playable characters, randomized levels and enemies, and over 150 items to collect and use. The game is simple to get into, but has lots of depth. Strategy is required if you want to win! | Evan@ShatteredPixel.com\n" +
                    "[SimplePlanes](https://play.google.com/store/apps/details?id=com.jundroo.SimplePlanes) | Paid | Phone+Tablet | Snap parts together to build your airplane's body. Place engines to add thrust. Design the wings and then strap yourself into the pilot's seat and see how it flies.  | games@jundroo.com\n" +
                    "\n" +
                    "#Category1 Entry3\n" +
                    "\n" +
                    "## Category2 Entry1  \n" +
                    "\n" +
                    "### Category3 Entry1\n" +
                    "Name | Price | Device | Description | Contact\n" +
                    ":-----------|:------------|:------------|:------------|:------------|  \n" +
                    "[Soda Dungeon](https://play.google.com/store/apps/details?id=com.armorgames.sodadungeon) | Free | Phone+Tablet | Manage your team of adventurers as you raid the local dungeon for treasure! Upgrade your tavern, purchase new sodas, and attract new party members. Gold, legendary items, and more await you! | shawn@afro-ninja.com\n" +
                    "[Sorcery! 1](https://play.google.com/store/apps/details?id=com.inkle.sorcery1) | Paid | Phone+Tablet | From legendary designer Steve Jackson, co-founder of Lionhead Studios (with Peter Molyneux), and Fighting Fantasy and Games Workshop (with Ian Livingstone); and inkle, the studio behind the award-winning Frankenstein app, Sorcery! is an interactive adventure like never before. | inkle@inklestudios.com\n" +
                    "[Sorcery! 2](https://play.google.com/store/apps/details?id=com.inkle.sorcery2) | Paid | Phone+Tablet | An epic adventure through Kharé: Cityport of Traps. Begin your story here! (Part 1 not required.) | inkle@inklestudios.com\n" +
                    "[Sorcery! 3](https://play.google.com/store/apps/details?id=com.inkle.sorcery3) | Paid | Phone+Tablet | An epic adventure through a cursed wilderness of monsters, traps and magic. Begin your journey here! (Parts 1 and 2 not required.) | inkle@inklestudios.com\n" +
                    "[Space Marshals](https://play.google.com/store/apps/details?id=com.pixelbite.sg) | Paid | Phone+Tablet | Space Marshals is a Sci-fi Wild West adventure taking place in outer space! This tactical top-down shooter puts you in the shoes of specialist Burton in his hunt for dangerous fugitives after a disastrous prison break.  | support@pixelbite.se\n" +
                    "[Tales From Deep Space](http://www.amazon.com/Amazon-Game-Studios-Tales-Space/dp/B00P73L20M) | Paid | Phone+Tablet | Tales From Deep Space is a comedic mis-adventure set on Big Moon, the most eccentric space station in the galaxy. Players help E, a traveling salesman, and his loyal luggage drone CASI escape when Big Moon is thrown into lockdown. E and CASI must work together to fight dangerous battles, solve fiendish puzzles and unravel the nefarious plot behind the mysterious \"Meek\" uprising. Players can switch between E and CASI in single player, and on Kindle Fire HDX, Fire Phone and 2014 Fire tablets, they can play in local, two-player co-op where each player controls the reluctant heroes individually on their own tablets. Trouble has never been so fun! | amazon-appstore-help@amazon.com  \n" +
                    "[The Abandoned](https://play.google.com/store/apps/details?id=com.gaijindistr.theabandoned) | Paid | Phone+Tablet | “The Abandoned” is an adventure game, where you need to survive in an area full of danger and mystery. Your goal is to stay alive and find the way out, fighting monsters and completing story driven missions.  | distribution@gaijin.net\n" +
                    "[The Room 1](https://play.google.com/store/apps/details?id=com.FireproofStudios.TheRoom) | Paid | Phone+Tablet | Welcome to The Room, a physical puzzler, wrapped in a mystery game, inside a beautifully tactile 3D world. | info@fireproofgames.com\n" +
                    "[The Room 2](https://play.google.com/store/apps/details?id=com.FireproofStudios.TheRoom2) | Paid | Phone+Tablet | Welcome to The Room Two, a physical puzzler, wrapped in a mystery game, inside a beautifully tactile 3D world. The much anticipated sequel to ‘The Room’, recipient of a BAFTA award, is here at last.  | info@fireproofgames.com\n" +
                    "\n" +
                    "##Category2 Entry2  \n" +
                    "\n" +
                    "### Category3 Entry1\n" +
                    "Name | Price | Device | Description | Contact\n" +
                    ":-----------|:------------|:------------|:------------|:------------|  \n" +
                    "[The Room 3](https://play.google.com/store/apps/details?id=com.FireproofStudios.TheRoom3) | Paid | Phone+Tablet | Welcome to The Room Three, a physical puzzle game within a beautifully tactile world. Lured to a remote island, you must draw upon all your puzzle-solving ability to navigate a series of trials devised by a mysterious figure known only as “The Craftsman”. | info@fireproofgames.com\n" +
                    "[Til Morning's Light](http://www.amazon.com/Amazon-Game-Studios-Mornings-Light/dp/B00QSMKS8S) | Paid | Phone+Tablet | Erica Page is an ordinary teenage girl, just trying to fit in. She’s also trapped in a mansion haunted by a 200 year-old curse. You know, the normal stuff. Help her explore the huge, creepy, and not exactly empty mansion, revealing its darkest secrets and hopefully a way out. There are clues to decipher, tools to collect, and puzzles to solve. If all else fails, Erica can beat the goo out of supernatural nasties with an arsenal of clubs, knives, and swords. Oh, did we forget to tell you? Erica has to escape by dawn, or she’ll become the next ghost in the mansion! | amazon-appstore-help@amazon.com\n" +
                    "[Vainglory](https://play.google.com/store/apps/details?id=com.superevilmegacorp.game) | Free | Phone+Tablet | Welcome to the Halcyon Fold. Here, magic clashes with technology, alliances forge in the heat of combat and cunning strategy wins the day. But no one fights alone. Join with friends in free-to-play, 3-vs-3 multiplayer online arena battles (MOBA). Choose from an ever-growing roster of 25+ heroes as you battle to destroy the enemy Vain crystal. | feedback@superevilmegacorp.com\n" +
                    "[Wayward Souls](https://play.google.com/store/apps/details?id=com.noodlecake.waywardsouls) | Paid | Phone+Tablet | Wayward Souls is an action-adventure game built for quick playthroughs and massive amounts of replay value. It was inspired by Spelunky, Secret of Mana, and our previous game, Mage Gauntlet. Procedurally generated random levels mean that every time you play the game, it's a different experience. Control one of six characters, all with their own unique playstyles, abilities, and equipment. Explore and fight for survival, in combat where your tactics, positioning, and timing matter. | support+android@noodlecake.com\n" +
                    "[World of Tanks Blitz](https://play.google.com/store/apps/details?id=net.wargaming.wot.blitz) | Free | Phone+Tablet | This hit free-to-win mobile MMO action game developed by Wargaming throws you into quick-fire tank combat inspired by WW2. Mobilize in over 200 massive tanks in stunning detail! Storm the frontlines with intuitive touch-screen controls built specifically for optimal online mobile gameplay.  | blitz_android_support@wargaming.net";
}