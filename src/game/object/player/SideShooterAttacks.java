package game.object.player;

import game.Attack;
import game.Game;
import util.Global;

/**
 * 
 * Defines side shooter attacks of the player, can also be used to define other
 * attacks that adds non bullet objects into the game.
 *
 */
public abstract class SideShooterAttacks {

	private static SideShooterAttacks[][] ssa;

	public static void init() {
		SideShooterAttacks[][] a = { {
		/**
		 * linear, 0
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 1
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 2
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 3
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 4
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 5
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 6
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				int sideshooternum = 3;
				for (int i = 0; i < sideshooternum; i++) {
					SideShooter s = new SideShooter(2.5f, 50, Global.Dir.PI2
							/ sideshooternum * i, .001f);
					s.setAttack(new Attack(s, true) {

						@Override
						public void init() {
							addBullet(new PlayerLinearBullet(Global.Dir.UP),
									Global.player_bullet_delay);
						}
					});
					s.activateAttack();
					Game.player.sideshooters.add(s);
				}
			}
		},
		/**
		 * linear, 7
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				int sideshooternum = 5;
				for (int i = 0; i < sideshooternum; i++) {
					SideShooter s = new SideShooter(2.5f, 50, Global.Dir.PI2
							/ sideshooternum * i, .001f);
					s.setAttack(new Attack(s, true) {

						@Override
						public void init() {
							addBullet(new PlayerLinearBullet(Global.Dir.UP),
									Global.player_bullet_delay);
						}
					});
					s.activateAttack();
					Game.player.sideshooters.add(s);
				}

			}
		},
		/**
		 * linear, 8
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 9
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 10
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 11
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 12
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 13
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * linear, 14
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		} }, {
		/**
		 * seeker, 0
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 1
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 2
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 3
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 4
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 5
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 6
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 7
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 8
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 9
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 10
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 11
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 12
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 13
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * seeker, 14
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		} }, {
		/**
		 * laser, 0
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 1
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 2
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 3
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				int sideshooternum = 2;
				for (int i = 0; i < sideshooternum; i++) {
					SideShooter s = new SideShooter(2.5f, 150, Global.Dir.PI2
							/ sideshooternum * i, .001f);
					s.setAttack(new Attack(s, true) {

						@Override
						public void init() {
							addBullet(new PlayerLaser(Global.Dir.UP),
									Global.player_laser_delay);
						}
					});
					s.activateAttack();
					Game.player.sideshooters.add(s);
				}
			}
		},
		/**
		 * laser, 4
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				int sideshooternum = 3;
				for (int i = 0; i < sideshooternum; i++) {
					SideShooter s = new SideShooter(2.5f, 150, Global.Dir.PI2
							/ sideshooternum * i, .001f);
					s.setAttack(new Attack(s, true) {

						@Override
						public void init() {
							addBullet(new PlayerLaser(Global.Dir.UP),
									Global.player_laser_delay);
						}
					});
					s.activateAttack();
					Game.player.sideshooters.add(s);
				}
			}
		},
		/**
		 * laser, 5
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				int sideshooternum = 3;
				for (int i = 0; i < sideshooternum; i++) {
					final SideShooter s = new SideShooter(2.5f, 150, Global.Dir.PI2
							/ sideshooternum * i, .001f);
					s.setAttack(new Attack(s, true) {

						@Override
						public void init() {
							addBullet(new TargetingPlayerLaser(s.x, s.y),
									Global.player_laser_delay);
						}
					});
					s.activateAttack();
					Game.player.sideshooters.add(s);
				}
			}
		},
		/**
		 * laser, 6
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 7
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 8
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 9
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 10
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 11
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 12
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 13
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		},
		/**
		 * laser, 14
		 */
		new SideShooterAttacks() {

			@Override
			public void activate() {
				// TODO Auto-generated method stub

			}
		} } };
		ssa = a;
	}

	public static void acquire(int type, int level) {
		for (SideShooter s : Game.player.sideshooters) {
			s.remove();
		}
		Game.player.sideshooters.clear();
		ssa[type][level].activate();
	}

	public abstract void activate();

}
