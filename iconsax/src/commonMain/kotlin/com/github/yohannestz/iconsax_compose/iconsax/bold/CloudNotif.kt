package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 21.27f, y = 8.76f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = 2.54f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.03f, dy1 = 0.72f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.25f, dy1 = -3.25f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.96f, dy1 = -2.29f)
                arcToRelative(a = 3.24f, b = 3.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.55f, dy1 = 2.28f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.18f, y = 18.73f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.83f, dy1 = 1.49f)
                horizontalLineTo(x = 5.97f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.96f, dy1 = -4.2f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.1f, dy1 = -4.05f)
                arcTo(horizontalEllipseRadius = 6.2f, verticalEllipseRadius = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.04f, y1 = 4.7f)
                curveTo(x1 = 10.1f, y1 = 3.53f, x2 = 13.0f, y2 = 3.34f, x3 = 15.18f, y3 = 4.95f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.53f, dy1 = 0.46f)
                lineToRelative(dx = -0.43f, dy = 0.45f)
                verticalLineToRelative(dy = 0.06f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 2.84f)
                arcToRelative(a = 4.76f, b = 4.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.14f, dy1 = 3.32f)
                arcToRelative(a = 5.55f, b = 5.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.22f, dy1 = 6.65f)
            }
        }.build().also { _cloudNotif = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudNotif: ImageVector? = null
