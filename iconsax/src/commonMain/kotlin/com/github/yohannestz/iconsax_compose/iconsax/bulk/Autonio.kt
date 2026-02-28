package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autonio: ImageVector
    get() {
        val current = _autonio
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Autonio",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.79f, y = 6.21f)
                lineTo(x = 9.66f, y = 9.76f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.21f, dy1 = 0.38f)
                horizontalLineToRelative(dx = 4.26f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.21f, dy1 = -0.38f)
                lineToRelative(dx = -2.13f, dy = -3.55f)
                arcToRelative(a = 0.24f, b = 0.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 0.0f)
                moveToRelative(dx = -3.43f, dy = 6.0f)
                lineToRelative(dx = -2.13f, dy = 3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.21f, dy1 = 0.38f)
                horizontalLineToRelative(dx = 4.26f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.21f, dy1 = -0.38f)
                lineToRelative(dx = -2.13f, dy = -3.55f)
                arcToRelative(a = 0.24f, b = 0.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 0.0f)
                moveToRelative(dx = 6.85f, dy = 0.0f)
                lineToRelative(dx = -2.13f, dy = 3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = 0.38f)
                horizontalLineToRelative(dx = 4.27f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = -0.38f)
                lineToRelative(dx = -2.12f, dy = -3.55f)
                curveToRelative(dx1 = -0.08f, dy1 = -0.16f, dx2 = -0.32f, dy2 = -0.16f, dx3 = -0.42f, dy3 = 0.0f)
            }
        }.build().also { _autonio = it }
    }

@Suppress("ObjectPropertyName")
private var _autonio: ImageVector? = null
