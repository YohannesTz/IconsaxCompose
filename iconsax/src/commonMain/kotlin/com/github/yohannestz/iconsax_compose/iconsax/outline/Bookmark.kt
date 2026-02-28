package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bookmark: ImageVector
    get() {
        val current = _bookmark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bookmark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.68f, y = 15.33f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.15f, dy1 = -0.29f)
                curveToRelative(dx1 = -0.83f, dy1 = -0.47f, dx2 = -1.28f, dy2 = -1.4f, dx3 = -1.28f, dy3 = -2.62f)
                verticalLineTo(y = 2.44f)
                curveTo(x1 = 6.25f, y1 = 2.04f, x2 = 6.59f, y2 = 1.7f, x3 = 7.0f, y3 = 1.7f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 9.98f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.65f, dx2 = 0.19f, dy2 = 1.13f, dx3 = 0.52f, dy3 = 1.31f)
                curveToRelative(dx1 = 0.35f, dy1 = 0.2f, dx2 = 0.89f, dy2 = 0.1f, dx3 = 1.48f, dy3 = -0.25f)
                lineToRelative(dx = 1.32f, dy = -0.79f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.85f, dy1 = 0.0f)
                lineToRelative(dx = 1.32f, dy = 0.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.35f, dx2 = 1.14f, dy2 = 0.44f, dx3 = 1.48f, dy3 = 0.24f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.19f, dx2 = 0.52f, dy2 = -0.67f, dx3 = 0.52f, dy3 = -1.3f)
                verticalLineTo(y = 2.43f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 9.98f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.22f, dx2 = -0.45f, dy2 = 2.15f, dx3 = -1.28f, dy3 = 2.62f)
                reflectiveCurveToRelative(dx1 = -1.92f, dy1 = 0.37f, dx2 = -2.99f, dy2 = -0.27f)
                lineToRelative(dx = -1.32f, dy = -0.79f)
                curveToRelative(dx1 = -0.06f, dy1 = -0.04f, dx2 = -0.25f, dy2 = -0.04f, dx3 = -0.31f, dy3 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.8f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.84f, dy1 = 0.55f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.68f, y = 15.33f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.15f, dy1 = -0.29f)
                curveToRelative(dx1 = -0.83f, dy1 = -0.47f, dx2 = -1.28f, dy2 = -1.4f, dx3 = -1.28f, dy3 = -2.62f)
                verticalLineTo(y = 2.44f)
                curveTo(x1 = 6.25f, y1 = 2.04f, x2 = 6.59f, y2 = 1.7f, x3 = 7.0f, y3 = 1.7f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 9.98f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.65f, dx2 = 0.19f, dy2 = 1.13f, dx3 = 0.52f, dy3 = 1.31f)
                curveToRelative(dx1 = 0.35f, dy1 = 0.2f, dx2 = 0.89f, dy2 = 0.1f, dx3 = 1.48f, dy3 = -0.25f)
                lineToRelative(dx = 1.32f, dy = -0.79f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.85f, dy1 = 0.0f)
                lineToRelative(dx = 1.32f, dy = 0.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.35f, dx2 = 1.14f, dy2 = 0.44f, dx3 = 1.48f, dy3 = 0.24f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.19f, dx2 = 0.52f, dy2 = -0.67f, dx3 = 0.52f, dy3 = -1.3f)
                verticalLineTo(y = 2.43f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 9.98f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.22f, dx2 = -0.45f, dy2 = 2.15f, dx3 = -1.28f, dy3 = 2.62f)
                reflectiveCurveToRelative(dx1 = -1.92f, dy1 = 0.37f, dx2 = -2.99f, dy2 = -0.27f)
                lineToRelative(dx = -1.32f, dy = -0.79f)
                curveToRelative(dx1 = -0.06f, dy1 = -0.04f, dx2 = -0.25f, dy2 = -0.04f, dx3 = -0.31f, dy3 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.8f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.84f, dy1 = 0.55f)
            }
        }.build().also { _bookmark = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmark: ImageVector? = null
