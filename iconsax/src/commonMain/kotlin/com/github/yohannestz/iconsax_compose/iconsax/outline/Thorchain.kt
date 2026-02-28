package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thorchain: ImageVector
    get() {
        val current = _thorchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Thorchain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.64f, y = 22.75f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.48f, dy1 = -0.8f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.15f, dy1 = -2.28f)
                lineToRelative(dx = 7.33f, dy = -7.96f)
                lineToRelative(dx = -3.55f, dy = -3.6f)
                arcToRelative(a = 1.84f, b = 1.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -2.98f)
                lineToRelative(dx = 8.94f, dy = -3.74f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.18f, dy1 = 0.59f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.05f, dy1 = 2.26f)
                lineToRelative(dx = -6.07f, dy = 7.4f)
                lineToRelative(dx = 3.58f, dy = 3.64f)
                arcToRelative(a = 1.84f, b = 1.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 2.98f)
                lineTo(x = 6.37f, y = 22.6f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.15f)
                moveToRelative(dx = 7.05f, dy = -9.96f)
                lineToRelative(dx = -7.27f, dy = 7.9f)
                curveToRelative(dx1 = -0.16f, dy1 = 0.17f, dx2 = -0.08f, dy2 = 0.33f, dx3 = -0.03f, dy3 = 0.42f)
                reflectiveCurveToRelative(dx1 = 0.19f, dy1 = 0.2f, dx2 = 0.4f, dy2 = 0.1f)
                lineToRelative(dx = 10.3f, dy = -4.33f)
                curveToRelative(dx1 = 0.14f, dy1 = -0.06f, dx2 = 0.18f, dy2 = -0.18f, dx3 = 0.2f, dy3 = -0.24f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.09f, dy1 = -0.3f)
                close()
                moveTo(x = 9.16f, y = 7.07f)
                lineToRelative(dx = 3.47f, dy = 3.5f)
                lineToRelative(dx = 5.96f, dy = -7.27f)
                curveToRelative(dx1 = 0.14f, dy1 = -0.17f, dx2 = 0.07f, dy2 = -0.33f, dx3 = 0.01f, dy3 = -0.41f)
                reflectiveCurveToRelative(dx1 = -0.18f, dy1 = -0.2f, dx2 = -0.4f, dy2 = -0.11f)
                lineTo(x = 9.26f, y = 6.53f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.2f, dy1 = 0.24f)
                curveToRelative(dx1 = -0.02f, dy1 = 0.06f, dx2 = 0.0f, dy2 = 0.19f, dx3 = 0.1f, dy3 = 0.3f)
            }
        }.build().also { _thorchain = it }
    }

@Suppress("ObjectPropertyName")
private var _thorchain: ImageVector? = null
