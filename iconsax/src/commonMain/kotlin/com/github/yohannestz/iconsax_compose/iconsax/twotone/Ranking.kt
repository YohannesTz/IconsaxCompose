package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ranking: ImageVector
    get() {
        val current = _ranking
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ranking",
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
                moveTo(x = 13.3f, y = 8.11f)
                lineToRelative(dx = 1.32f, dy = 2.64f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.78f)
                lineToRelative(dx = 2.39f, dy = 0.4f)
                curveToRelative(dx1 = 1.53f, dy1 = 0.26f, dx2 = 1.89f, dy2 = 1.36f, dx3 = 0.79f, dy3 = 2.46f)
                lineTo(x = 17.0f, y = 16.25f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.39f, dy1 = 1.36f)
                lineToRelative(dx = 0.53f, dy = 2.31f)
                curveToRelative(dx1 = 0.42f, dy1 = 1.82f, dx2 = -0.55f, dy2 = 2.53f, dx3 = -2.16f, dy3 = 1.58f)
                lineToRelative(dx = -2.24f, dy = -1.33f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = 0.0f)
                lineTo(x = 9.02f, y = 21.5f)
                curveToRelative(dx1 = -1.61f, dy1 = 0.95f, dx2 = -2.58f, dy2 = 0.24f, dx3 = -2.16f, dy3 = -1.58f)
                lineToRelative(dx = 0.53f, dy = -2.3f)
                arcTo(horizontalEllipseRadius = 1.7f, verticalEllipseRadius = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 16.24f)
                lineTo(x = 5.14f, y = 14.4f)
                curveToRelative(dx1 = -1.1f, dy1 = -1.1f, dx2 = -0.74f, dy2 = -2.2f, dx3 = 0.79f, dy3 = -2.46f)
                lineToRelative(dx = 2.39f, dy = -0.4f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = -0.78f)
                lineToRelative(dx = 1.32f, dy = -2.64f)
                curveToRelative(dx1 = 0.71f, dy1 = -1.43f, dx2 = 1.89f, dy2 = -1.43f, dx3 = 2.6f, dy3 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 9.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 12.0f, dy = 7.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = -6.0f, dy = 2.0f)
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _ranking = it }
    }

@Suppress("ObjectPropertyName")
private var _ranking: ImageVector? = null
