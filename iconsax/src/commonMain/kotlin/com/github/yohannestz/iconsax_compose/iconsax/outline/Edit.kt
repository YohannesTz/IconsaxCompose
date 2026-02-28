package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
    get() {
        val current = _edit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Edit",
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
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 11.41f, y1 = 2.75f, x2 = 11.0f, y2 = 2.75f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.5f, y = 17.69f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.58f, dy1 = -0.62f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = -1.95f)
                lineToRelative(dx = 0.43f, dy = -3.01f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.87f, dy1 = -1.74f)
                lineToRelative(dx = 7.88f, dy = -7.88f)
                quadToRelative(dx1 = 3.0f, dy1 = -3.0f, dx2 = 6.0f, dy2 = 0.0f)
                quadToRelative(dx1 = 1.63f, dy1 = 1.64f, dx2 = 1.48f, dy2 = 3.3f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.48f, dy1 = 2.69f)
                lineToRelative(dx = -7.88f, dy = 7.88f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = 0.87f)
                lineToRelative(dx = -3.01f, dy = 0.43f)
                quadToRelative(dx1 = -0.2f, dy1 = 0.04f, dx2 = -0.38f, dy2 = 0.03f)
                moveToRelative(dx = 8.07f, dy = -14.14f)
                lineToRelative(dx = -7.88f, dy = 7.88f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.45f, dy1 = 0.89f)
                lineToRelative(dx = -0.43f, dy = 3.0f)
                quadToRelative(dx1 = -0.06f, dy1 = 0.46f, dx2 = 0.17f, dy2 = 0.69f)
                reflectiveQuadToRelative(dx1 = 0.68f, dy1 = 0.17f)
                lineToRelative(dx = 3.01f, dy = -0.43f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.89f, dy1 = -0.45f)
                lineToRelative(dx = 7.88f, dy = -7.88f)
                quadToRelative(dx1 = 0.97f, dy1 = -0.97f, dx2 = 1.04f, dy2 = -1.77f)
                quadToRelative(dx1 = 0.1f, dy1 = -0.96f, dx2 = -1.04f, dy2 = -2.11f)
                curveToRelative(dx1 = -1.6f, dy1 = -1.6f, dx2 = -2.7f, dy2 = -1.15f, dx3 = -3.87f, dy3 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.85f, y = 9.83f)
                lineToRelative(dx = -0.2f, dy = -0.03f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.46f, dy1 = -5.46f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = -0.93f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.92f, dy1 = 0.52f)
                arcToRelative(a = 6.4f, b = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.42f, dy1 = 4.42f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = 0.93f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.55f)
            }
        }.build().also { _edit = it }
    }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null
