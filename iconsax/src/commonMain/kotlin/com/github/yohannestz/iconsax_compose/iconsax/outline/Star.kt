package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Star: ImageVector
    get() {
        val current = _star
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Star",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.48f, y = 20.69f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.33f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.3f, dx2 = -1.02f, dy2 = -1.04f, dx3 = -0.63f, dy3 = -2.72f)
                lineToRelative(dx = 0.57f, dy = -2.46f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.2f, dy1 = -0.75f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                curveToRelative(dx1 = -1.05f, dy1 = -1.04f, dx2 = -0.96f, dy2 = -1.95f, dx3 = -0.82f, dy3 = -2.4f)
                reflectiveCurveToRelative(dx1 = 0.6f, dy1 = -1.24f, dx2 = 2.06f, dy2 = -1.5f)
                lineToRelative(dx = 2.55f, dy = -0.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = -0.43f)
                lineToRelative(dx = 1.41f, dy = -2.82f)
                curveTo(x1 = 12.62f, y1 = 3.5f, x2 = 13.52f, y2 = 3.3f, x3 = 14.0f, y3 = 3.3f)
                reflectiveCurveToRelative(dx1 = 1.38f, dy1 = 0.2f, dx2 = 2.06f, dy2 = 1.56f)
                lineToRelative(dx = 1.41f, dy = 2.82f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = 0.43f)
                lineToRelative(dx = 2.55f, dy = 0.42f)
                curveToRelative(dx1 = 1.46f, dy1 = 0.24f, dx2 = 1.92f, dy2 = 1.04f, dx3 = 2.06f, dy3 = 1.49f)
                reflectiveCurveToRelative(dx1 = 0.23f, dy1 = 1.36f, dx2 = -0.82f, dy2 = 2.4f)
                lineToRelative(dx = -1.99f, dy = 2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.2f, dy1 = 0.75f)
                lineToRelative(dx = 0.56f, dy = 2.46f)
                curveToRelative(dx1 = 0.4f, dy1 = 1.69f, dx2 = -0.23f, dy2 = 2.43f, dx3 = -0.63f, dy3 = 2.72f)
                reflectiveCurveToRelative(dx1 = -1.29f, dy1 = 0.66f, dx2 = -2.79f, dy2 = -0.23f)
                lineTo(x = 14.4f, y = 18.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.82f, dy1 = 0.0f)
                lineToRelative(dx = -2.39f, dy = 1.42f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.7f, dy1 = 0.56f)
                moveTo(x = 14.0f, y = 4.8f)
                curveToRelative(dx1 = -0.16f, dy1 = 0.0f, dx2 = -0.45f, dy2 = 0.19f, dx3 = -0.72f, dy3 = 0.73f)
                lineToRelative(dx = -1.4f, dy = 2.82f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.69f, dy1 = 1.24f)
                lineToRelative(dx = -2.55f, dy = 0.42f)
                curveToRelative(dx1 = -0.57f, dy1 = 0.1f, dx2 = -0.83f, dy2 = 0.3f, dx3 = -0.88f, dy3 = 0.47f)
                reflectiveCurveToRelative(dx1 = 0.04f, dy1 = 0.48f, dx2 = 0.45f, dy2 = 0.89f)
                lineToRelative(dx = 2.0f, dy = 1.99f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.61f, dy1 = 2.14f)
                lineToRelative(dx = -0.57f, dy = 2.46f)
                curveToRelative(dx1 = -0.17f, dy1 = 0.7f, dx2 = -0.06f, dy2 = 1.09f, dx3 = 0.05f, dy3 = 1.18f)
                reflectiveCurveToRelative(dx1 = 0.51f, dy1 = 0.07f, dx2 = 1.13f, dy2 = -0.31f)
                lineToRelative(dx = 2.4f, dy = -1.42f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.4f, dy = 1.42f)
                curveToRelative(dx1 = 0.62f, dy1 = 0.37f, dx2 = 1.02f, dy2 = 0.39f, dx3 = 1.13f, dy3 = 0.3f)
                curveToRelative(dx1 = 0.11f, dy1 = -0.07f, dx2 = 0.22f, dy2 = -0.45f, dx3 = 0.05f, dy3 = -1.17f)
                lineToRelative(dx = -0.57f, dy = -2.46f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = -2.14f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.4f, dx2 = 0.5f, dy2 = -0.73f, dx3 = 0.44f, dy3 = -0.88f)
                reflectiveCurveToRelative(dx1 = -0.3f, dy1 = -0.37f, dx2 = -0.88f, dy2 = -0.47f)
                lineTo(x = 17.81f, y = 9.6f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = -1.24f)
                lineToRelative(dx = -1.4f, dy = -2.82f)
                curveTo(x1 = 14.44f, y1 = 5.0f, x2 = 14.15f, y2 = 4.8f, x3 = 14.0f, y3 = 4.8f)
                moveTo(x = 8.0f, y = 5.75f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 1.59f, y1 = 5.75f, x2 = 1.25f, y2 = 5.41f, x3 = 1.25f, y3 = 5.0f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 4.25f, x2 = 2.0f, y2 = 4.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.41f, y1 = 5.75f, x2 = 8.0f, y2 = 5.75f)
                moveToRelative(dx = -3.0f, dy = 14.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 18.25f, x2 = 2.0f, y2 = 18.25f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 5.41f, y1 = 19.75f, x2 = 5.0f, y2 = 19.75f)
                moveToRelative(dx = -2.0f, dy = -7.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 11.25f, x2 = 2.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 3.41f, y1 = 12.75f, x2 = 3.0f, y2 = 12.75f)
            }
        }.build().also { _star = it }
    }

@Suppress("ObjectPropertyName")
private var _star: ImageVector? = null
