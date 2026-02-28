package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderFavorite: ImageVector
    get() {
        val current = _folderFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderFavorite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.2f, y = 14.78f)
                lineToRelative(dx = 2.58f, dy = 2.26f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.43f, dy1 = 0.0f)
                lineToRelative(dx = 2.58f, dy = -2.26f)
                arcToRelative(a = 1.66f, b = 1.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = -2.58f)
                lineTo(x = 12.0f, y = 12.74f)
                lineToRelative(dx = -0.71f, dy = -0.53f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 2.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 11.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = -1.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 1.83f, dy2 = 0.44f, dx3 = 2.4f, dy3 = 1.2f)
                lineToRelative(dx = 1.5f, dy = 2.0f)
                curveTo(x1 = 12.78f, y1 = 5.7f, x2 = 13.0f, y2 = 6.0f, x3 = 14.0f, y3 = 6.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.0f, dx3 = 5.0f, dy3 = 5.0f)
                close()
            }
        }.build().also { _folderFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _folderFavorite: ImageVector? = null
