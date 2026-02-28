package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockOne: ImageVector
    get() {
        val current = _lockOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LockOne",
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
                moveTo(x = 12.0f, y = 17.35f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.26f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.26f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.65f, y = 9.44f)
                horizontalLineToRelative(dx = -9.3f)
                curveTo(x1 = 3.25f, y1 = 9.44f, x2 = 2.0f, y2 = 10.7f, x3 = 2.0f, y3 = 14.8f)
                verticalLineToRelative(dy = 1.86f)
                curveTo(x1 = 2.0f, y1 = 20.75f, x2 = 3.25f, y2 = 22.0f, x3 = 7.35f, y3 = 22.0f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineTo(y = 14.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.25f, dy2 = -5.35f, dx3 = -5.35f, dy3 = -5.35f)
                moveTo(x = 12.0f, y = 18.74f)
                arcToRelative(a = 3.02f, b = 3.02f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.05f)
                arcToRelative(a = 3.02f, b = 3.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.05f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 7.12f, y = 9.45f)
                verticalLineTo(y = 8.28f)
                curveTo(x1 = 7.12f, y1 = 5.35f, x2 = 7.95f, y2 = 3.4f, x3 = 12.0f, y3 = 3.4f)
                reflectiveCurveToRelative(dx1 = 4.88f, dy1 = 1.95f, dx2 = 4.88f, dy2 = 4.88f)
                verticalLineToRelative(dy = 1.17f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = 0.09f)
                verticalLineTo(y = 8.28f)
                curveTo(x1 = 18.28f, y1 = 5.58f, x2 = 17.63f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 5.72f, y1 = 5.58f, x2 = 5.72f, y2 = 8.28f)
                verticalLineToRelative(dy = 1.25f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = -0.08f)
            }
        }.build().also { _lockOne = it }
    }

@Suppress("ObjectPropertyName")
private var _lockOne: ImageVector? = null
