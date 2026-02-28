package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudNotif: ImageVector
    get() {
        val current = _cloudNotif
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudNotif",
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
                moveTo(x = 20.57f, y = 11.01f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.9f, dy1 = -1.77f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.36f, dy1 = -2.97f)
                lineTo(x = 16.25f, y = 6.2f)
                curveToRelative(dx1 = -2.19f, dy1 = -2.65f, dx2 = -5.78f, dy2 = -2.64f, dx3 = -8.2f, dy3 = -1.27f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.91f, dy1 = 7.24f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = 4.04f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.95f, dy1 = 4.17f)
                horizontalLineToRelative(dx = 10.34f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.81f, dy1 = -1.48f)
                curveToRelative(dx1 = 2.52f, dy1 = -2.2f, dx2 = 2.19f, dy2 = -5.8f, dx3 = 0.43f, dy3 = -7.88f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.27f, y = 8.76f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = 2.54f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.03f, dy1 = 0.72f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.25f, dy1 = -3.25f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.96f, dy1 = -2.29f)
                arcToRelative(a = 3.24f, b = 3.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.55f, dy1 = 2.28f)
            }
        }.build().also { _cloudNotif = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudNotif: ImageVector? = null
