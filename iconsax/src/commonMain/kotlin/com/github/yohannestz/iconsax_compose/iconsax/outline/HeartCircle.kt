package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartCircle: ImageVector
    get() {
        val current = _heartCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.25f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.09f)
                curveToRelative(dx1 = -2.15f, dy1 = -0.73f, dx2 = -5.56f, dy2 = -3.35f, dx3 = -5.56f, dy3 = -7.25f)
                arcToRelative(a = 3.76f, b = 3.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.15f, dy1 = -2.9f)
                arcToRelative(a = 3.76f, b = 3.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.14f, dy1 = 2.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.89f, dx2 = -3.41f, dy2 = 6.51f, dx3 = -5.57f, dy3 = 7.25f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.25f)
                moveToRelative(dx = -2.4f, dy = -9.6f)
                arcToRelative(a = 2.26f, b = 2.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.25f, dy1 = 2.27f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.49f, dx2 = 3.37f, dy2 = 5.43f, dx3 = 4.55f, dy3 = 5.83f)
                horizontalLineToRelative(dx = 0.18f)
                curveToRelative(dx1 = 1.18f, dy1 = -0.4f, dx2 = 4.55f, dy2 = -2.34f, dx3 = 4.55f, dy3 = -5.83f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.04f, dy1 = -1.36f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.38f, dx2 = -0.92f, dy2 = 0.38f, dx3 = -1.2f, dy3 = 0.0f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.6f, y1 = 8.65f)
            }
        }.build().also { _heartCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _heartCircle: ImageVector? = null
