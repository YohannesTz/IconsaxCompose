package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FavoriteChart: ImageVector
    get() {
        val current = _favoriteChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FavoriteChart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 13.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.33f, y = 14.5f)
                lineToRelative(dx = 2.38f, dy = -3.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.41f, dy1 = -0.18f)
                lineToRelative(dx = 1.83f, dy = 1.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.41f, dy1 = -0.17f)
                lineToRelative(dx = 2.31f, dy = -2.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.48f, y = 15.82f)
                lineToRelative(dx = 0.28f, dy = 0.57f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = 0.6f)
                lineToRelative(dx = 0.38f, dy = 0.06f)
                curveToRelative(dx1 = 1.14f, dy1 = 0.2f, dx2 = 1.41f, dy2 = 1.03f, dx3 = 0.59f, dy3 = 1.86f)
                lineToRelative(dx = -0.35f, dy = 0.35f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.29f, dy1 = 1.02f)
                lineToRelative(dx = 0.05f, dy = 0.21f)
                curveToRelative(dx1 = 0.31f, dy1 = 1.38f, dx2 = -0.42f, dy2 = 1.91f, dx3 = -1.62f, dy3 = 1.2f)
                lineToRelative(dx = -0.26f, dy = -0.16f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.12f, dy1 = 0.0f)
                lineToRelative(dx = -0.26f, dy = 0.15f)
                curveToRelative(dx1 = -1.21f, dy1 = 0.73f, dx2 = -1.94f, dy2 = 0.2f, dx3 = -1.62f, dy3 = -1.19f)
                lineToRelative(dx = 0.05f, dy = -0.2f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.29f, dy1 = -1.03f)
                lineToRelative(dx = -0.35f, dy = -0.35f)
                curveToRelative(dx1 = -0.82f, dy1 = -0.83f, dx2 = -0.55f, dy2 = -1.67f, dx3 = 0.59f, dy3 = -1.86f)
                lineTo(x = 16.44f, y = 17.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = -0.6f)
                lineToRelative(dx = 0.28f, dy = -0.57f)
                curveToRelative(dx1 = 0.54f, dy1 = -1.09f, dx2 = 1.42f, dy2 = -1.09f, dx3 = 1.96f, dy3 = 0.0f)
            }
        }.build().also { _favoriteChart = it }
    }

@Suppress("ObjectPropertyName")
private var _favoriteChart: ImageVector? = null
