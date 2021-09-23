package net.mcreator.ccalumod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ccalumod.item.RazzanthiumShardItem;
import net.mcreator.ccalumod.item.RazzantheumIngotItem;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.function.Supplier;
import java.util.Map;

public class MergerMergeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency entity for procedure MergerMerge!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (5))) < 64)) {
			if (((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (4))) > 0)) {
				if (((new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
									if (stack != null)
										return stack.getCount();
								}
							}
						}
						return 0;
					}
				}.getAmount((int) (1))) > 0)) {
					if (((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (2))) > 0)) {
						if (((new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) entity).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
											if (stack != null)
												return stack.getCount();
										}
									}
								}
								return 0;
							}
						}.getAmount((int) (3))) > 0)) {
							if (((new Object() {
								public ItemStack getItemStack(int sltid) {
									Entity _ent = entity;
									if (_ent instanceof ServerPlayerEntity) {
										Container _current = ((ServerPlayerEntity) _ent).openContainer;
										if (_current instanceof Supplier) {
											Object invobj = ((Supplier) _current).get();
											if (invobj instanceof Map) {
												return ((Slot) ((Map) invobj).get(sltid)).getStack();
											}
										}
									}
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) (1))).getItem() == RazzanthiumShardItem.block)) {
								if (((new Object() {
									public ItemStack getItemStack(int sltid) {
										Entity _ent = entity;
										if (_ent instanceof ServerPlayerEntity) {
											Container _current = ((ServerPlayerEntity) _ent).openContainer;
											if (_current instanceof Supplier) {
												Object invobj = ((Supplier) _current).get();
												if (invobj instanceof Map) {
													return ((Slot) ((Map) invobj).get(sltid)).getStack();
												}
											}
										}
										return ItemStack.EMPTY;
									}
								}.getItemStack((int) (2))).getItem() == RazzanthiumShardItem.block)) {
									if (((new Object() {
										public ItemStack getItemStack(int sltid) {
											Entity _ent = entity;
											if (_ent instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) _ent).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														return ((Slot) ((Map) invobj).get(sltid)).getStack();
													}
												}
											}
											return ItemStack.EMPTY;
										}
									}.getItemStack((int) (3))).getItem() == RazzanthiumShardItem.block)) {
										if (((new Object() {
											public ItemStack getItemStack(int sltid) {
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															return ((Slot) ((Map) invobj).get(sltid)).getStack();
														}
													}
												}
												return ItemStack.EMPTY;
											}
										}.getItemStack((int) (4))).getItem() == RazzanthiumShardItem.block)) {
											{
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
															_current.detectAndSendChanges();
														}
													}
												}
											}
											{
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
															_current.detectAndSendChanges();
														}
													}
												}
											}
											{
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
															_current.detectAndSendChanges();
														}
													}
												}
											}
											{
												Entity _ent = entity;
												if (_ent instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) _ent).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
															_current.detectAndSendChanges();
														}
													}
												}
											}
											if (entity instanceof PlayerEntity) {
												Container _current = ((PlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack _setstack = new ItemStack(RazzantheumIngotItem.block);
														_setstack.setCount((int) ((new Object() {
															public int getAmount(int sltid) {
																if (entity instanceof ServerPlayerEntity) {
																	Container _current = ((ServerPlayerEntity) entity).openContainer;
																	if (_current instanceof Supplier) {
																		Object invobj = ((Supplier) _current).get();
																		if (invobj instanceof Map) {
																			ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
																			if (stack != null)
																				return stack.getCount();
																		}
																	}
																}
																return 0;
															}
														}.getAmount((int) (5))) + 1));
														((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
														_current.detectAndSendChanges();
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
