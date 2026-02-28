package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserEdit: ImageVector
    get() {
        val current = _userEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 10.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 14.5f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.43f, y = 14.74f)
                curveToRelative(dx1 = -0.9f, dy1 = -0.9f, dx2 = -1.6f, dy2 = -0.61f, dx3 = -2.22f, dy3 = 0.0f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 0.59f)
                lineToRelative(dx = -0.19f, dy = 1.35f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.49f, dx2 = 0.27f, dy2 = 0.83f, dx3 = 0.76f, dy3 = 0.76f)
                lineToRelative(dx = 1.35f, dy = -0.19f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = -0.3f)
                lineToRelative(dx = 3.53f, dy = -3.54f)
                curveToRelative(dx1 = 0.62f, dy1 = -0.6f, dx2 = 0.91f, dy2 = -1.31f, dx3 = 0.01f, dy3 = -2.21f)
            }
        }.build().also { _userEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _userEdit: ImageVector? = null
